public class Codec {

    static Map<String,String> cache;
    static int count;
    public Codec()
    {
        cache=new HashMap<>();
        count=0;
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String encoded=count+"";
        cache.put(encoded,longUrl);
        count++;
        return encoded;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return cache.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));