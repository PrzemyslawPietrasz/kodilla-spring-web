package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {

    private final String bun;
    private final String sauce;
    private final int burgers;
    private List<String> ingredients = new ArrayList<>();

    public static class BigMacBuilder {
        private String bun;
        private String sauce;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, sauce, burgers, ingredients);
        }
    }

    private BigMac(final String bun, final String sauce, final int burgers, List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
        this.burgers = burgers;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
