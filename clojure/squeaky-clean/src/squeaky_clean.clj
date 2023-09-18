(ns squeaky-clean
  (:require [clojure.string :as str]))

(defn- rm-space 
  [s]
  (str/replace s " " "_"))

(defn- rp-ctrl-chars 
  [s]
  (str/replace s #"[\u0000-\u001F\u007F-\u009F]" "CTRL"))

(defn- to-camel-case
  [s]
  (str/replace s #"-(\p{L})" #(str/upper-case (%1 1))))

(defn- om-non-letter-chars
  [s]
  (str/replace s #"[^\p{L}_]" ""))

(defn- om-greek-lower-letters
  [s]
  (str/replace s #"[\u03B1-\u03C9]" ""))

(defn clean
  "TODO: add docstring"
  [s]
  (-> s 
      (rm-space)
      (rp-ctrl-chars)
      (to-camel-case)
      (om-non-letter-chars)
      (om-greek-lower-letters)))
