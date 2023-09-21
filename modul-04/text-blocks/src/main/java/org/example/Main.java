package org.example;

public class Main {
    public static void main(String[] args) {
//        String text = "{\n" +
//                "    \"glossary\": {\n" +
//                "        \"title\": \"example glossary\",\n" +
//                "\t\t\"GlossDiv\": {\n" +
//                "            \"title\": \"S\",\n" +
//                "\t\t\t\"GlossList\": {\n" +
//                "                \"GlossEntry\": {\n" +
//                "                    \"ID\": \"SGML\",\n" +
//                "\t\t\t\t\t\"SortAs\": \"SGML\",\n" +
//                "\t\t\t\t\t\"GlossTerm\": \"Standard Generalized Markup Language\",\n" +
//                "\t\t\t\t\t\"Acronym\": \"SGML\",\n" +
//                "\t\t\t\t\t\"Abbrev\": \"ISO 8879:1986\",\n" +
//                "\t\t\t\t\t\"GlossDef\": {\n" +
//                "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\n" +
//                "\t\t\t\t\t\t\"GlossSeeAlso\": [\"GML\", \"XML\"]\n" +
//                "                    },\n" +
//                "\t\t\t\t\t\"GlossSee\": \"markup\"\n" +
//                "                }\n" +
//                "            }\n" +
//                "        }\n" +
//                "    }\n" +
//                "}";

//        System.out.println(text);
        String text = """
                {
                    "glossary": {
                        "title": "example glossary",
                		"GlossDiv": {
                            "title": "S",
                			"GlossList": {
                                "GlossEntry": {
                                    "ID": "SGML",
                					"SortAs": "SGML",
                					"GlossTerm": "Standard Generalized Markup Language",
                					"Acronym": "SGML",
                					"Abbrev": "ISO 8879:1986",
                					"GlossDef": {
                                        "para": "A meta-markup language, used to create markup languages such as DocBook.",
                						"GlossSeeAlso": ["GML", "XML"]
                                    },
                					"GlossSee": "markup"
                                }
                            }
                        }
                    }
                }
                """;
        System.out.println(text);
    }
}