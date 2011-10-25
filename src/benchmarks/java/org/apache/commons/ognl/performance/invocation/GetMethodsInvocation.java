/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.commons.ognl.performance.invocation;

import org.apache.commons.ognl.performance.runtime.RuntimeWrapper;

/**
 * User: mcucchiara
 * Date: 18/10/11
 * Time: 15.57
 */
public class GetMethodsInvocation extends RepeatableInvocation {

    public GetMethodsInvocation(RuntimeWrapper runtimeWrapper) throws Exception {
        super(runtimeWrapper);
    }

    public GetMethodsInvocation(RuntimeWrapper runtimeWrapper, int times) throws Exception {
        super(runtimeWrapper, times);
    }

    @Override
    protected void invoke(Class<?> c) throws Exception {
        getRuntime().getMethods(c, false);
        getRuntime().getMethods(c, true);
    }

}