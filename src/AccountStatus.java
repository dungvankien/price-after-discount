public enum AccountStatus {
    NotRegistered(1),
    SimpleCustomer(2),
    ValuableCustomer(3),
    MostValuableCustomer(4);
    private int value;
    AccountStatus(int value) {
        this.value = value;
    }
    private static AccountStatus getValueAccountStatus(int value){
        for (AccountStatus accountStatus: AccountStatus.values()) {
            if(accountStatus.value == value) {
                return accountStatus;
            }
        }
        throw new IllegalArgumentException("invalid");
    }

}
