(ns log-levels
  (:require [clojure.string :as str]))

(defn message
  "Takes a string representing a log line
   and returns its message with whitespace trimmed."
  [s]
  (let [substr (str/split s #":")]
    (str/trim (get substr 1))))

(defn log-level
  "Takes a string representing a log line
   and returns its level in lower-case."
  [s]
  (str/replace 
   (str/replace  
    (str/lower-case 
     (get (str/split s #":") 0)) #"\[" "") #"\]" ""))

(defn reformat
  "Takes a string representing a log line and formats it
   with the message first and the log level in parentheses."
  [s] 
  (let [substr (str/split s #":")]
    (str (str (str/trim (get substr 1)) " ")
         (str/replace (str/replace  (str/lower-case (get substr 0)) #"\[" "(") #"\]" ")"))))

