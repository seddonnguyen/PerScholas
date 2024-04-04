package module._303.glab._11._1;

public class GMultipleDatatype<DataTypeOne, DataTypeTwo> {
    DataTypeOne valueOne;
    DataTypeTwo valueTwo;

    public GMultipleDatatype(DataTypeOne v1, DataTypeTwo v2) {
        this.valueOne = v1;
        this.valueTwo = v2;
    }

    public DataTypeOne getValueOne() {
        return this.valueOne;
    }

    public DataTypeOne setValueOne(DataTypeOne valueOne) {
        return this.valueOne = valueOne;
    }

    public DataTypeTwo getValueTwo() {
        return this.valueTwo;
    }

    public DataTypeTwo setValueTwo(DataTypeTwo valueTwo) {
        return this.valueTwo = valueTwo;
    }
}
