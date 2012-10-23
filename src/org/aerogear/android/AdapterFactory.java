/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.aerogear.android;

import org.aerogear.android.core.HttpRestProvider;
import org.aerogear.android.datamanager.MemoryStorage;
import org.aerogear.android.datamanager.Store;
import org.aerogear.android.datamanager.StoreType;
import org.aerogear.android.pipeline.Pipe;
import org.aerogear.android.pipeline.RestAdapter;
import org.aerogear.android.pipeline.Type;

import java.net.URL;

import static org.aerogear.android.datamanager.StoreType.*;
import static org.aerogear.android.pipeline.Type.REST;

public final class AdapterFactory {

    private AdapterFactory() {}

    public static Pipe createPipe(Type type, Class klass, URL url) {
        if (type.equals(REST)) {
            return new RestAdapter(klass, new HttpRestProvider(url));
        }
        throw new IllegalArgumentException("Type is not supported yet");
    }

    public static Store createStore(StoreType type) {
        if (type.equals(MEMORY)) {
            return new MemoryStorage();
        }
        throw new IllegalArgumentException("Type is not supported yet");
    }

}
