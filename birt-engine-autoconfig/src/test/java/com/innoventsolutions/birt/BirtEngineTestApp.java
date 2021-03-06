/*******************************************************************************
 * Copyright (C) 2020 Innovent Solutions
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package com.innoventsolutions.birt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Used to test REST functions using Spring Framework.
 * 
 * @author Scott Rosenbaum / Steve Schafer
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.innoventsolutions.birt")
public class BirtEngineTestApp {

	public static void main(final String[] args) {
		SpringApplication.run(BirtEngineTestApp.class, args);
	}

}
