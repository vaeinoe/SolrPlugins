/**
 *
 * Copyright 2012 The National Library of Finland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fi.nationallibrary.ndl.solrvoikko;

import java.util.List;

import org.puimula.libvoikko.Analysis;
import org.puimula.libvoikko.Voikko;

/**
 * 
 * @author ere.maijala@helsinki.fi
 *
 */
public class App
{
	private static final String CLASS_ATTR = "CLASS";
	private static final String BASEFORM_ATTR = "BASEFORM";
	private static final String WORDBASES_ATTR = "WORDBASES";

    public static void main(String[] args)
    {
        if (args.length <= 0) {
            System.out.println("Enter the term to analyze as a command line parameter");
            System.exit(1);
        }
        Voikko voikko = new Voikko("fi-x-morphoid");
        String term = args[0];
        System.out.println("Term to analyze: " + term);
        List<Analysis> analysisList = voikko.analyze(term);
        if (!analysisList.isEmpty())
        {
            int i = 0;
            for (Analysis analysis: analysisList) {
                System.out.println("\nAnalysis " + (++i) + " (" + analysis.get(CLASS_ATTR) + "):\n");
                if (analysis.containsKey(BASEFORM_ATTR)) {
                    System.out.println("Baseform: " + analysis.get(BASEFORM_ATTR));

                }
                if (analysis.containsKey(WORDBASES_ATTR)) {
                    String bases = analysis.get(WORDBASES_ATTR);
                    System.out.println("Word bases: " + bases);
                }
            }
        } else {
            System.out.println("No analysis results");
        }
    	System.exit(0);
    }

}