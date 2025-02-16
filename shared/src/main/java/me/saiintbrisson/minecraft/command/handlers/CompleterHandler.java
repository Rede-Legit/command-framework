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

import java.util.List;

/**
 * @author Luiz Carlos Carvalho
 * @since 2.0
 */
@FunctionalInterface
public interface CompleterHandler<S> {
    /**
     * Handles a completion request.
     *
     * @param context the command context.
     * @return the list of possible arguments.
     */
    List<String> handle(Context<S> context);
}
