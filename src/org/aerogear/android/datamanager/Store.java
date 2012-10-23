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

import java.util.List;

/**
 * Represents an abstraction layer for a storage system.
 */
public interface Store<T> {

    /**
     * Returns the type of the underlying 'store implementation'
     *
     * @return StoreType
     */
    public StoreType getType();

    /**
     * Reads all the data from the underlying storage system.
     *
     * @return List of T
     */
    public List<T> readAll();

    /**
     * Reads a specific object/record from the underlying storage system.
     *
     * @param id id from the desired object
     * @return T
     */
    public T read(String id);

    /**
     * Reads all, based on a filter, from the underlying storage system.
     */
    public void filter();

    /**
     * Saves the given object in the underlying storage system.
     *
     * @param item Object to save
     */
    public void save(T item);

    /**
     *  Resets the entire storage system.
     */
    public void reset();

    /**
     * Removes a specific object/record from the underlying storage system.
     *
     * @param item
     */
    public void remove(T item);

}
