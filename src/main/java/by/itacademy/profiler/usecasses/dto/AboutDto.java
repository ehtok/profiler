package by.itacademy.profiler.usecasses.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class AboutDto {
    @Length(max = 50, message = "Description is too long, the max number of symbols is 50")
    @NotBlank(message = "Field must not be empty")
    private String description;

    @NotBlank(message = "Field must not be empty")
    private String selfPresentation;

    public AboutDto() {
    }

    public AboutDto(String description, String selfPresentation) {
        this.description = description;

        this.selfPresentation = selfPresentation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSelfPresentation() {
        return selfPresentation;
    }

    public void setSelfPresentation(String selfPresentation) {
        this.selfPresentation = selfPresentation;
    }
}