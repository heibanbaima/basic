package multithread;

import java.util.concurrent.CompletableFuture;

public class ep16 {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<String> cfQueryFromSina = CompletableFuture.supplyAsync(()->{
            return queryCode("中国石油","https://finance.sina.com.cn/code/");
        }); //两个CompletableFuture执行异步查询
        CompletableFuture<String> cfQueryFrom163 = CompletableFuture.supplyAsync(()->{
            return queryCode("中国石油","https://money.163.com/code/");
        });

        CompletableFuture<Object> cfQuery = CompletableFuture.anyOf(cfQueryFromSina,cfQueryFrom163); //用anyOf合并为一个新的CompletableFuture

        CompletableFuture<Double> cfFetchFromSina = cfQuery.thenApplyAsync((code)->{
            return fetchPrice((String)code,"https://finance.sina.com.cn/price/");
        });
        CompletableFuture<Double> cfFetchFrom163 = cfQuery.thenApplyAsync((code)->{
            return fetchPrice((String)code,"https://money.163.com/price/");
        }); //两个CompletableFuture执行异步查询

        CompletableFuture<Object> cfFetch = CompletableFuture.anyOf(cfFetchFromSina,cfFetchFrom163); //用anyOf合并为一个新的CompletableFuture

        cfFetch.thenAccept((result)->{
            System.out.println("price:"+result);
        });

        Thread.sleep(200);

    }
    static String queryCode(String name,String url){
        System.out.println("query code from"+url+"...");
        try {
            Thread.sleep((long)(Math.random()*100));
        }catch (InterruptedException e){}
        return "601857";
    }

    static Double fetchPrice(String code,String url){
        System.out.println("query price from"+url+"...");
        try {
            Thread.sleep((long)(Math.random()*100));
        }catch (InterruptedException e){}
        return 5+Math.random()*20;
    }
}
