package com.test.chapter9;

import com.google.common.hash.BloomFilter;

import com.google.common.hash.Funnels;

import java.nio.charset.Charset;

/**
 * @author harrypotter
 */
public class BloomFilterDemo {

    public static void main(String[] args) {
        BloomFilter bloomFilter=BloomFilter.create
                (Funnels.stringFunnel(Charset.defaultCharset()),
                        //1%
                        1000000,0.001);
        bloomFilter.put("mic");
        System.out.println(bloomFilter.mightContain("mic"));
    }
}
