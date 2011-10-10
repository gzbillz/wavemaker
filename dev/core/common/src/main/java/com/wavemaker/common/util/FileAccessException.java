/*
 *  Copyright (C) 2007-2011 VMWare, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wavemaker.common.util;

import java.io.IOException;

import com.wavemaker.common.MessageResource;

/**
 * @author Matt Small
 * @version $Rev$ - $Date$
 * 
 */
public class FileAccessException extends IOException {

    private static final long serialVersionUID = 1L;

    public FileAccessException(MessageResource resource, Object... args) {
        super(resource.getMessage(args));
    }
}