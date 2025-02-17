package com.leidos.glidepath.logger;

/**
 * Created by rushk1 on 10/9/2014.
 */
public interface LogListener {
    /**
     * Takes in a {@link com.leidos.glidepath.logger.LogEntry} that has been flagged as relevant by LogListener#checkEntry.
     * @param in The relevant LogEntry
     */
    public void newLogEntryCallback(LogEntry in);
}
