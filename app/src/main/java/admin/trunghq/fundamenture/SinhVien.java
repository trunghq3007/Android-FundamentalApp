package admin.trunghq.fundamenture;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Hà Quang Trung
 * @version 1.0.0
 * @description
 * @desc Technical Director, FPT-Software.
 * @created ${Date}
 * @updated ${Date}
 * @modified by
 * @updated on ${Date}
 * @since 1.0
 */
public class SinhVien implements Parcelable {
    public static final Creator<SinhVien> CREATOR = new Creator<SinhVien>() {
        @Override
        public SinhVien createFromParcel(Parcel in) {
            return new SinhVien(in);
        }

        @Override
        public SinhVien[] newArray(int size) {
            return new SinhVien[size];
        }
    };
    int tuoi;
    private String hoTen;

    /**
     * Instantiates a new Sinh vien.
     *
     * @param hoTen the ho ten
     * @param tuoi  the tuoi
     */
    public SinhVien(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    protected SinhVien(Parcel in) {
        hoTen = in.readString();
        tuoi = in.readInt();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        //return super.toString();
        return hoTen + " năm nay " + tuoi + " tuổi";

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(hoTen);
        dest.writeInt(tuoi);
    }
}
