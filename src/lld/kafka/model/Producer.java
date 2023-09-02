package lld.kafka.model;

import java.util.UUID;

public class Producer {
    String id;
    public Producer() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        if (o == this) {
            return true;
        }

        Producer other = (Producer) o;
        return this.id.equals(other.id);
    }

    @Override
    public String toString() {
        return "Producer-Id = " + this.id;
    }
}
