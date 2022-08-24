/*******************************************************************************
 * Copyright (c) 2013, 2015 EclipseSource and others.
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
package com.github.bingoohuang.minijson.performancetest;

import java.io.IOException;

import com.github.bingoohuang.minijson.Json;
import com.github.bingoohuang.minijson.JsonValue;
import com.github.bingoohuang.minijson.performancetest.caliper.CaliperRunner;
import com.google.caliper.SimpleBenchmark;


public class IntVsLongBenchmark extends SimpleBenchmark {

  public void timeValueOfInt(int reps) {
    for (int i = 0; i < reps; i++) {
      checkValue(Json.value(23));
    }
  }

  public void timeValueOfLong(int reps) {
    for (int i = 0; i < reps; i++) {
      checkValue(Json.value(23l));
    }
  }

  // prevent compiler from inlining
  private static void checkValue(JsonValue value) {
    assert value != null;
  }

  public static void main(String[] args) throws IOException {
    new CaliperRunner(IntVsLongBenchmark.class).exec(args);
  }

}
