package com.ecom.product.config;

import com.ecom.product.model.Category;
import com.ecom.product.model.Product;
import com.ecom.product.repository.CategoryRepository;
import com.ecom.product.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        /*Clear all Existing Data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        //Create Categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category shoes = new Category();
        shoes.setName("Shoes");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, shoes));

        //Create Products
        Product phone = new Product();
        phone.setName("LoremIpsum");
        phone.setDescription("Latest model smarthphone with amazing features");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(7999.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("LoremIpsums");
        laptop.setDescription("High Performance Laptop for work and Play");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(999.99);
        laptop.setCategory(electronics);

        Product teampayaman = new Product();
        teampayaman.setName("Cong Clothing");
        teampayaman.setDescription("Peso Sign Teampayaman");
        teampayaman.setImageUrl("https://placehold.co/600x400");
        teampayaman.setPrice(649.99);
        teampayaman.setCategory(clothing);

        Product peak = new Product();
        peak.setName("Taichi Supreme");
        peak.setDescription("Drop-In Taichi Midsole Supreme");
        peak.setImageUrl("https://placehold.co/600x400");
        peak.setPrice(4794.99);
        peak.setCategory(shoes);

        Product manny = new Product();
        manny.setName("Manny Pacquiao");
        manny.setDescription("Edi Tipaklong");
        manny.setImageUrl("https://www.meme-arsenal.com/memes/17d2b22c7d5715884ba85315b9c6fe67.jpg");
        manny.setPrice(100000.000);
        manny.setCategory(shoes);

        Product manny2 = new Product();

        productRepository.saveAll(Arrays.asList(manny, peak, phone, laptop, teampayaman));
        */

    }
}
