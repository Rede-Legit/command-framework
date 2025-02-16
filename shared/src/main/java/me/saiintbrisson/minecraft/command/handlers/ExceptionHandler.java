/*
 * Copyright 2020 Luiz Carlos Mourão Paes de Carvalho
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package me.saiintbrisson.minecraft.command.handlers;

import me.saiintbrisson.minecraft.command.command.Context;

/**
 * Handles an exception thrown by a command.
 *
 * @author Luiz Carlos Carvalho
 * @since 2.0
 */
@FunctionalInterface
public interface ExceptionHandler<S, E extends Throwable> {
    /**
     * Handles an exception thrown when execution a command.
     *
     * @param context the execution context.
     * @param exception the exception thrown.
     */
    void handle(Context<S> context, E exception);
}
