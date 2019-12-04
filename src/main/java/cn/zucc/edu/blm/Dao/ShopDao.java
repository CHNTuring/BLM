package cn.zucc.edu.blm.Dao;

import cn.zucc.edu.blm.bean.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ShopDao extends JpaRepository<Shop,Integer> {
    Shop findShopByShopTelAndShopPwd(String shopTel,String shopPwd);
    Shop findShopByShopTel(String shopTel);

}
