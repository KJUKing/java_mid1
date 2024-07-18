package lang.lang.immutable.address;

import lang.immutable.address.ImmutableAddress;

public class MemberV2 {

    private String name;
    private lang.immutable.address.ImmutableAddress address;

    public MemberV2(String name, lang.immutable.address.ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public lang.immutable.address.ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
