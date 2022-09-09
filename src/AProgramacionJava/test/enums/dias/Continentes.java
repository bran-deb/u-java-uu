package AProgramacionJava.test.enums.dias;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private final int numPaises;

    Continentes(int numPaises){
        this.numPaises = numPaises;
    }

    public int getNumPaises(){
        return this.numPaises;
    }
}
