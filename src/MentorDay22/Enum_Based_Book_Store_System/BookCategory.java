package MentorDay22.Enum_Based_Book_Store_System;

public enum BookCategory {
    FICTION("Imaginary stories and characters"),
    NON_FICTION("Factual and real-life accounts"),
    SCIENCE("Knowledge and discoveries in natural and physical sciences"),
    HISTORY("Records and interpretations of past events"),
    FANTASY("Mythical worlds and magical adventures");

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    BookCategory(String description) {
        this.description = description;
    }
}
