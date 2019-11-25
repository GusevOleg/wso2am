/*
*  Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.grant.ntlm.utils;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler {

    private static final Map<String, String> inputs = new HashMap<String, String>();

    public static boolean setInputs(String[] arguments) {

        if (arguments.length == 0) {
            printMessage();
            return false;
        }
        if (arguments.length == 1 && arguments[0].equals("--help")) {
            printMessage();
            return false;
        }

        // now loop through the arguments list to capture the options
        for (int i = 0; i < arguments.length; i++) {
            if (arguments[i].equals("-url")) {
                if (arguments.length - 1 == i) {
                    throw new RuntimeException("Toekn endpoint is missing");
                }
                inputs.put("-url", arguments[++i]);
            } else if (arguments[i].equals("-key")) {
                if (arguments.length - 1 == i) {
                    throw new RuntimeException("Consumer Key is missing");
                }
                inputs.put("-key", arguments[++i]);

            } else if (arguments[i].equals("-secret")) {
                if (arguments.length - 1 == i) {
                    throw new RuntimeException("Consumer Secret is missing");
                }
                inputs.put("-secret", arguments[++i]);
            }
        }

        return true;
    }


    private static void printMessage() {
        System.out.println("Usage: NTLM Grant Type-client <options>");
        System.out.println("Valid options are:");
        System.out.println("\t-url :\t(Required) The token endpoint.");
        System.out.println("\t-key :\t(Required) The consumer key.");
        System.out.println("\t-secret:\t(Required) The consumer secret.");
        System.out.println();
        System.out.println("Example to execute the NTLM grant client");
        System.out.println("\te.g: ant -url TokenURL -key consumerKey -secret consumerSecret");
    }

    public static String getTokenendpoint() {
        return inputs.get("-url");
    }

    public static String getConsumerKey() {
        return inputs.get("-key");
    }

    public static String getConsumerSecret() {
        return inputs.get("-secret");
    }

}

