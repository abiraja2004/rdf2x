/*
 * Copyright 2017 Merck Sharp & Dohme Corp. a subsidiary of Merck & Co.,
 * Inc., Kenilworth, NJ, USA.
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

package com.merck.rdf2x.main;

import com.merck.rdf2x.jobs.JobFactory;

import javax.naming.ConfigurationException;

/**
 * Main class used to run jobs based on command-line arguments.
 */
public class Main {
    /**
     * Get job based on command-line arguments and run it.
     *
     * @param args command-line arguments
     * @throws ConfigurationException in case config is not valid
     */
    public static void main(String args[]) throws ConfigurationException {
        Runnable job = JobFactory.getJob(args);

        if (job == null) {
            return;
        }

        job.run();
    }
}
