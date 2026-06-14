package com.tiempometa.printer;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Collections;
import java.util.List;

import javax.swing.JPanel;

import net.sf.jasperreports.engine.JRException;

import com.tiempometa.printer.result.ResultReport;

/**
 * Swing panel that displays a rendered {@link ResultReport} as an image.
 *
 * <p>The host app drives updates: call {@link #setReport(ResultReport)} whenever
 * fresh data arrives. The panel renders all pages and shows the current one
 * scaled to fill its bounds. Use {@link #nextPage()} or {@link #showPage(int)}
 * to cycle through pages; the host app owns the scroll timer.
 *
 * <p>Hardcopy: pass {@link #getCurrentReport()} to {@link Printer#printToPrinter}
 * using the same report object without re-fetching data.
 */
public class LetterboardPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private List<Image> pages = Collections.emptyList();
    private int currentPage = 0;
    private ResultReport currentReport;
    private float zoom = 1.0f;

    public LetterboardPanel() {
        setBackground(java.awt.Color.BLACK);
    }

    /**
     * Renders all pages of {@code report} and shows page 0.
     * Runs the Jasper fill synchronously — call from a background thread.
     */
    public void setReport(ResultReport report) throws JRException {
        pages = Printer.renderAllPages(report, zoom);
        currentReport = report;
        currentPage = 0;
        repaint();
    }

    /** Returns the number of rendered pages (0 if no report has been set yet). */
    public int getPageCount() {
        return pages.size();
    }

    /** Returns the most recently set report, or {@code null} if none. */
    public ResultReport getCurrentReport() {
        return currentReport;
    }

    /** Advances to the next page, wrapping around to 0. */
    public void nextPage() {
        showPage(pages.isEmpty() ? 0 : (currentPage + 1) % pages.size());
    }

    /** Displays the given page index if in range. */
    public void showPage(int index) {
        if (!pages.isEmpty() && index >= 0 && index < pages.size()) {
            currentPage = index;
            repaint();
        }
    }

    /** Zoom factor applied at render time (default 1.0). Must be set before {@link #setReport}. */
    public void setZoom(float zoom) {
        this.zoom = zoom;
    }

    public float getZoom() {
        return zoom;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!pages.isEmpty() && currentPage < pages.size()) {
            g.drawImage(pages.get(currentPage), 0, 0, getWidth(), getHeight(), this);
        }
    }
}
