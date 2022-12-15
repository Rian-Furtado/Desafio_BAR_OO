public class Bill {
    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    public Bill() { }
    public void setGender(char gender) { this.gender = gender; }

    public void setBeer(int beer) { this.beer = beer; }

    public void setBarbecue(int barbecue) { this.barbecue = barbecue; }

    public void setSoftDrink(int softDrink) { this.softDrink = softDrink; }

    public double cover() {
        if (feeding() > 30) {
            return 0;
        } else {
            return 4.00;
        }
    }

    public double feeding() { return beer * 5.0 + barbecue * 7.0 + softDrink * 3.0; }

    public double ticket() {
        if (gender == 'M' || gender == 'm') {
            return 10.00;
        } else {
            return 8.00;
        }
    }
    public double total() { return feeding() + cover() + ticket(); }
}
