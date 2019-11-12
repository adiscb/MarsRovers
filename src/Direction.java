public enum Direction {
    N, S, W, E;

    public static Direction create(String direction) {

        if(direction.equals("N"))
            return N;
        if(direction.equals("W"))
            return W;
        if(direction.equals("S"))
            return S;
        return E;
    }
}
