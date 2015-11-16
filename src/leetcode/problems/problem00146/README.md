# Problem:
  LRU Cache
  
  Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.

  get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
  
  set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
  
# Clarifications:
  - Can the cache be instantiated with size 0? -> Assume yes and that nothing can be set to the cache.

# Approach:
  - Leverage the LinkedHashMap data structure by extending it.
  - Enable the accessOrder mode (as the default is insertion order) via the appropriate constructor.
  - Get:
    - Simply invoke a getOrDefault on the LinkedHashMap with a default value of -1.
  - Set:
    - Simply invoke a put on the underlying map.
  - Eviction:
    - When using accessOrder mode there is an option to override the "removeEldestEntry" method.  This method is invoked after every "put" or "putAll" invocation on the LinkedHashMap, passing it the candidate entry to possibly remove.
    - We will override this to return true when the size of the map exceeds the capacity (post-put).

# Runtime Analysis:
##Definitions:
  - n is the size of the map at any time.

##Breakdown:
  - Get: O(1)
  - Set: O(1)

# Tags: Hard, Cache, LRU, LinkedHashMap, Review, Eviction, Access Order, Constant

# Notes:
  - Knowing about the data structure and mechanics of access order and eviction mechanisms were key.
  - Enabling access order mode means that merely querying the map with "get" incurs a possible structural modification.