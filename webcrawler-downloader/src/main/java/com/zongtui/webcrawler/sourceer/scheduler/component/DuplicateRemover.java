package com.zongtui.webcrawler.sourceer.scheduler.component;

import com.zongtui.webcrawler.sourceer.Request;
import com.zongtui.webcrawler.sourceer.Task;

/**
 * Remove duplicate requests.
 * @author code4crafer@gmail.com
 * @since 0.5.1
 */
public interface DuplicateRemover {
    /**
     *
     * Check whether the request is duplicate.
     *
     * @param request
     * @param task
     * @return
     */
    public boolean isDuplicate(Request request, Task task);

    /**
     * Reset duplicate check.
     * @param task
     */
    public void resetDuplicateCheck(Task task);

    /**
     * Get TotalRequestsCount for monitor.
     * @param task
     * @return
     */
    public int getTotalRequestsCount(Task task);

}
