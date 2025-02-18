package com.tit.regex.basicproblems.extractlinksfromwebpage;

public class ExtractLinksFromWebPage {
    public static void main(String[] args) {
        // Extract URLs from the given text and print the result
        System.out.println(ExtractLink.extract("Visit https://www.google.com and http://example.org for more info."));
    }
}
