/*
 * Copyright 2014-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.codecentric.boot.admin.server.ui.web;

import de.codecentric.boot.admin.server.web.AdminController;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@AdminController
public class UiController {
    private final String adminContextPath;

    public UiController(String adminContextPath) {
        this.adminContextPath = adminContextPath;
    }

    @ModelAttribute(value = "adminContextPath", binding = false)
    public String getAdminContextPath() {
        return adminContextPath;
    }

    @GetMapping(path = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String index() {
        return "index";
    }

    @GetMapping(path = "/login", produces = MediaType.TEXT_HTML_VALUE)
    public String login() {
        return "login";
    }

}
