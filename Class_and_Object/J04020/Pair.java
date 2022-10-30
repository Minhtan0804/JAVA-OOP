package Class_and_Object.J04020;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public boolean isPrime() {
        if (!(this.key instanceof Integer) || !(this.value instanceof Integer))
            return false;
        int a = ((Integer) this.key).intValue();
        int b = ((Integer) this.value).intValue();

        return this.isPrime(a) && this.isPrime(b);
    }

    public boolean isPrime(Integer n) {
        if (n < 2) return false;
        if (n == 2) return true;

        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n) ; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public String toString() {
        return ((Integer) this.key).intValue() + " " + ((Integer) this.value).intValue();
    }
}
