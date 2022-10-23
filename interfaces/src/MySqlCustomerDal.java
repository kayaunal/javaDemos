public class MySqlCustomerDal implements ICustomerDal, IRepository{
//classlar birden fazla interface implement edebiliyorken sadece 1 class implement edebilir
    @Override
    public void Add() {
        System.out.println("MySql eklendi");
    }
}
