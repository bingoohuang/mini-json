/*******************************************************************************
 * Copyright (c) 2013, 2015 EclipseSource.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.github.bingoohuang.minijson.performancetest.jsonrunners;

public class JsonRunnerFactory {

  public static JsonRunner findByName(String name) {
    if ("null".equals(name)) {
      return new NullRunner();
    } else if ("org-json".equals(name)) {
      return new JsonOrgRunner();
    } else if ("gson".equals(name)) {
      return new GsonRunner();
    } else if ("jackson".equals(name)) {
      return new JacksonRunner();
    } else if ("json-simple".equals(name)) {
      return new SimpleRunner();
    } else if ("json-smart".equals(name)) {
      return new JsonSmartRunner();
    } else if ("minijson".equals(name)) {
      return new MinimalJsonRunner();
    } else {
      throw new IllegalArgumentException("Unknown parser: " + name);
    }
  }

}
