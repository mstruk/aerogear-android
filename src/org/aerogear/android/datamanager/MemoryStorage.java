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

package org.aerogear.android.datamanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoryStorage<T> implements Store<T> {

    private List data = new ArrayList();

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreType getType() {
        return StoreType.MEMORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> readAll() {
        return Collections.unmodifiableList(data);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T read(String id) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void filter() {
        // TODO Implement
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(T item) {
        data.add(item);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() {
        data.clear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(T item) {
        data.remove(item);
    }

}