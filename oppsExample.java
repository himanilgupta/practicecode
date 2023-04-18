class Bank{
abstract getBankIntrest();
}

class SBIBank extends Bank {
getBankIntrest() {return 7;}
}
class PNBBank extends Bank {
getBankIntrest() {return 8;}
}
class RBLBank extends Bank {
getBankIntrest() {return 9;}
}

