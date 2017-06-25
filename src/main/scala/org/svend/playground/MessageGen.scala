package org.svend.playground

import scala.util.Random


object MessageGen {

  val r = new Random()

  val bluesWords = "Blues is a genre and musical form originated by African Americans in the Deep South of the United States around the end of the 19th century. The genre developed from roots in African musical traditions, African-American work songs, spirituals, and folk music.[1] Blues incorporated spirituals, work songs, field hollers, shouts, chants, and rhymed simple narrative ballads.[3] The blues form, ubiquitous in jazz, rhythm and blues and rock and roll, is characterized by the call-and-response pattern, the blues scale and specific chord progressions, of which the twelve-bar blues is the most common. Blue notes (or \"worried notes\"), usually thirds or fifths flattened in pitch, are also an essential part of the sound. Blues shuffles or walking bass reinforce the trance-like rhythm and form a repetitive effect known as the groove.\n\nBlues as a genre is also characterized by its lyrics, bass lines, and instrumentation. Early traditional blues verses consisted of a single line repeated four times. It was only in the first decades of the 20th century that the most common current structure became standard: the AAB pattern, consisting of a line sung over the four first bars, its repetition over the next four, and then a longer concluding line over the last bars. Early blues frequently took the form of a loose narrative, often relating the troubles experienced in African-American society. Many elements, such as the call-and-response format and the use of blue notes, can be traced back to the music of Africa. The origins of the blues are also closely related to the religious music of the Afro-American community, the spirituals. The first appearance of the blues is often dated to after the ending of slavery and, later, the development of juke joints. It is associated with the newly acquired freedom of the former slaves. Chroniclers began to report about blues music at the dawn of the 20th century. The first publication of blues sheet music was in 1908. Blues has since evolved from unaccompanied vocal music and oral traditions of slaves into a wide variety of styles and subgenres. Blues subgenres include country blues, such as Delta blues and Piedmont blues, as well as urban blues styles such as Chicago blues and West Coast blues. World War II marked the transition from acoustic to electric blues and the progressive opening of blues music to a wider audience, especially white listeners. In the 1960s and 1970s, a hybrid form called blues rock evolved.".split(" ")
  val moods = List("bluesy", "very bluesy", "blues is the way", "let's listen to some blues")
  val numUsers = 20

  def genBluesStatement(size: Int): String =
    (1 to size).map(_ => bluesWords(r.nextInt(bluesWords.size))).mkString(" ")

  def genMood = moods(r.nextInt(moods.size))

  def genUserId = r.nextInt(numUsers)

  def genMessage = UserMessage(genUserId, genMood, genBluesStatement(50))


}