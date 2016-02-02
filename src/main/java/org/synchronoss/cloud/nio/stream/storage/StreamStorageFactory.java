/*
 * Copyright (C) 2015 Synchronoss Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.synchronoss.cloud.nio.stream.storage;

import java.io.File;

/**
 * <p> A factory for {@code StreamStorage}.
 *
 * <p> Default implementation is {@link DeferredFileStreamStorageFactory}
 *
 */
public interface StreamStorageFactory {

    /**
     * <p> Creates the {@code StreamStorage}.
     *
     * @return The {@code StreamStorage}.
     */
    StreamStorage create();

    /**
     * @param file The File to write to.
     * @param threshold The Threshold to be reached before the stream is written to disk.
     * @return The {@code StreamStorage}
     */
    StreamStorage create(File file, int threshold);

}