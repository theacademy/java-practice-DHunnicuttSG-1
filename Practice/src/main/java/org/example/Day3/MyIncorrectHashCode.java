package org.example.Day3;

import java.util.Objects;

public class MyIncorrectHashCode {

        private int id;
        private String name;

        public MyIncorrectHashCode(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyIncorrectHashCode that = (MyIncorrectHashCode) o;
            return id == that.id && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
