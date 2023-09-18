(ns elyses-destructured-enchantments)

(defn first-card
  "Returns the first card from deck."
  [deck]
  (first deck))

(defn second-card
  "Returns the second card from deck."
  [deck] 
  (second deck))

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [deck]
  (let [[deck1 deck2 & remaining] deck]
    (into [] (concat [deck2 deck1] (vec remaining)))))

(defn discard-top-card
  "Returns a sequence containing the first card and
   a sequence of the remaining cards in the deck."
  [deck]
  (let [[deck1 & remaining] deck]
        [deck1 remaining]))

(def face-cards
  ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards between its head and tail."
  [deck]
  (if (empty? deck) face-cards
      (let [[deck1 & remaining] deck]
        (into [] (concat [deck1] face-cards remaining)))))