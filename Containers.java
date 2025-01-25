public class Containers {
    int n1;
    int n2;
    int maxvalue;

    public Containers() {
        this.maxvalue = 100;
        this.n1 = 0;
        this.n2 = 0;
    }

    public void add(int input1) {
        if (input1 > 0) {
            if (this.n1 + input1 > this.maxvalue) {
                this.n1 = maxvalue;
            } else {
                this.n1 += input1;
            }
        }
    }

    public void moveAmt(int input) {
        if (input>0) {
            if (this.n2 + input > this.maxvalue) {
                this.n2 = maxvalue;
            } else {
                this.n2 = this.n2 + input;
            } this.n1=this.n1-input;
        }
    }

    public void remove(int input) {
        if (input > 0) {
            if (input > this.n2) {
                this.n2 = 0;
            } else {
                this.n2 -= input;
            }
        }
    }

    public int Container1() {
        return this.n1;
    }

    public int Container2() {
        return this.n2;
    }

    public int getMaxvalue() {
        return this.maxvalue;
    }

}

