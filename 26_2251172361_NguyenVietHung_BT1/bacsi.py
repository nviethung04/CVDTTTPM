class BenhNhan:
    def __init__(self, ten):
        self.ten = ten
        self.danh_sach_bac_si = []

    def them_bac_si(self, bac_si):
        if bac_si not in self.danh_sach_bac_si:
            self.danh_sach_bac_si.append(bac_si)

    def __str__(self):
        return self.ten


class BacSi:
    def __init__(self, ten):
        self.ten = ten
        self.danh_sach_benh_nhan = []

    def them_benh_nhan(self, benh_nhan):
        if benh_nhan not in self.danh_sach_benh_nhan:
            self.danh_sach_benh_nhan.append(benh_nhan)
            benh_nhan.them_bac_si(self)

    def hien_thi_danh_sach(self):
        print(f"Bác sĩ {self.ten} phụ trách các bệnh nhân:")
        for bn in self.danh_sach_benh_nhan:
            print(f" - {bn.ten}")

# Minh họa:
bs1 = BacSi("Dr. A")
bs2 = BacSi("Dr. B")
bn1 = BenhNhan("Nguyễn Văn An")
bn2 = BenhNhan("Trần Thị Bê")

# Gán bệnh nhân cho bác sĩ
bs1.them_benh_nhan(bn1)
bs1.them_benh_nhan(bn2)
bs2.them_benh_nhan(bn1)

# Hiển thị danh sách bệnh nhân của từng bác sĩ
bs1.hien_thi_danh_sach()
bs2.hien_thi_danh_sach()
