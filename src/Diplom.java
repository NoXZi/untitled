private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            text.append(roles[i] + ":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ": ")) {
                    text.append(j+1 + ")" + textLines[j].replaceFirst(roles[i]+":", "") + '\n');
                }
            }
            text.append('\n');
        }
        return text.toString();
}
