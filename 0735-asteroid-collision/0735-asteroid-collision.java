class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> pos = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                pos.push(asteroids[i]);
            } else {
                int n = asteroids[i];
                while (!pos.isEmpty() && pos.peek() > 0 && Math.abs(asteroids[i]) > pos.peek()) {
                    pos.pop();
                }
                if (!pos.isEmpty() && (Math.abs(asteroids[i])) == pos.peek()) {
                    pos.pop();
                } else if (pos.isEmpty() || 0 > pos.peek()) {
                    pos.push(asteroids[i]);
                }
            }
        }
        int arr[] = new int[pos.size()];
        for (int i = pos.size() - 1; i >= 0; i--) {
            arr[i] = pos.pop();
        }
        return arr;
    }
}