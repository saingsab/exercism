(ns reverse-string)

(defn- single [s]
  s)

(defn- words [s]
  (apply str (reverse s)))

(defn reverse-string  ;; <- arglist goes here
  ([] "")
  ([s] 
   (-> s 
       (single)
       (words))))
