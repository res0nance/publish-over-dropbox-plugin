package org.jenkinsci.plugins.publishoverdropbox.domain;

import org.jenkinsci.plugins.publishoverdropbox.domain.model.FolderMetadata;
import org.jenkinsci.plugins.publishoverdropbox.domain.model.RestException;

import java.io.IOException;
import java.io.InputStream;

public interface DropboxAdapter {
    boolean changeWorkingDirectory(String path) throws RestException;

    FolderMetadata makeDirectory(String directory) throws RestException;

    void cleanWorkingFolder() throws IOException;

    void pruneFolder(String path, int pruneRootDays) throws RestException;

    void storeFile(String name, InputStream content, long length) throws RestException;

    boolean isConnected();

    boolean connect() throws IOException;

    boolean disconnect() throws IOException;

    void setTimeout(int timeout);

    int getTimeout();
}
