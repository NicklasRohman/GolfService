--liquibase formatted sql

--changeset nicklas.rohman:2 logicalFilePath:01_golf_values.sql
--comment: Adding structure for gamesetup

START TRANSACTION;

--
-- Databas: `golfprogram`
--

-- --------------------------------------------------------

--
-- Tabellstruktur `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `course_id` bigint(20) NOT NULL,
  `course_name` varchar(250) CHARACTER SET utf8 COLLATE utf8_swedish_ci NOT NULL DEFAULT '""',
  `hole1` int(3) NOT NULL DEFAULT '4',
  `hole2` int(3) NOT NULL DEFAULT '4',
  `hole3` int(3) NOT NULL,
  `hole4` int(3) NOT NULL,
  `hole5` int(3) NOT NULL,
  `hole6` int(3) NOT NULL,
  `hole7` int(3) NOT NULL,
  `hole8` int(3) NOT NULL,
  `hole9` int(3) NOT NULL,
  `hole10` int(3) NOT NULL,
  `hole11` int(3) NOT NULL,
  `hole12` int(3) NOT NULL,
  `hole13` int(3) NOT NULL,
  `hole14` int(3) NOT NULL,
  `hole15` int(3) NOT NULL,
  `hole16` int(3) NOT NULL,
  `hole17` int(3) NOT NULL,
  `hole18` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `course`
--

INSERT INTO course (`course_id`, `course_name`, `hole1`, `hole2`, `hole3`, `hole4`, `hole5`, `hole6`, `hole7`, `hole8`, `hole9`, `hole10`, `hole11`, `hole12`, `hole13`, `hole14`, `hole15`, `hole16`, `hole17`, `hole18`) VALUES
(7, 'abc', 4, 4, 4, 3, 3, 3, 3, 5, 5, 3, 5, 3, 3, 5, 3, 4, 5, 3),
(8, 'Läckö GK', 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4);

-- --------------------------------------------------------

--
-- Tabellstruktur `player`
--

CREATE TABLE IF NOT EXISTS `player` (
  `player_id` bigint(11) NOT NULL,
  `player_name` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_swedish_ci NOT NULL DEFAULT '""'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `player`
--

INSERT INTO `player` (`player_id`, `player_name`) VALUES
(2, 'Jan'),
(9, 'Nicklas');

-- --------------------------------------------------------

--
-- Tabellstruktur `round`
--

CREATE TABLE IF NOT EXISTS `round` (
  `roundID` bigint(20) NOT NULL,
  `playerID` bigint(20) NOT NULL,
  `courseID` bigint(20) NOT NULL,
  `hole1` int(11) NOT NULL,
  `hole2` int(11) NOT NULL,
  `hole3` int(11) NOT NULL,
  `hole4` int(11) NOT NULL,
  `hole5` int(11) NOT NULL,
  `hole6` int(11) NOT NULL,
  `hole7` int(11) NOT NULL,
  `hole8` int(11) NOT NULL,
  `hole9` int(11) NOT NULL,
  `hole10` int(11) NOT NULL,
  `hole11` int(11) NOT NULL,
  `hole12` int(11) NOT NULL,
  `hole13` int(11) NOT NULL,
  `hole14` int(11) NOT NULL,
  `hole15` int(11) NOT NULL,
  `hole16` int(11) NOT NULL,
  `hole17` int(11) NOT NULL,
  `hole18` int(11) NOT NULL,
  `totalScore` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `round`
--

INSERT INTO `round` (`roundID`, `playerID`, `courseID`, `hole1`, `hole2`, `hole3`, `hole4`, `hole5`, `hole6`, `hole7`, `hole8`, `hole9`, `hole10`, `hole11`, `hole12`, `hole13`, `hole14`, `hole15`, `hole16`, `hole17`, `hole18`, `totalScore`) VALUES
(1, 2, 7, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0),
(2, 2, 7, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0),
(3, 2, 7, 4, 4, 4, 4, 4, 4, 4, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0),
(4, 2, 8, 4, 4, 4, 4, 4, 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0),
(5, 9, 8, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0),
(6, 9, 7, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0),
(7, 2, 7, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0),
(8, 2, 7, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0),
(9, 2, 7, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0),
(10, 2, 7, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 40, 0),
(11, 9, 8, 44, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0);

--
-- Index för dumpade tabeller
--

--
-- Index för tabell `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`course_id`);

--
-- Index för tabell `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`player_id`);

--
-- Index för tabell `round`
--
ALTER TABLE `round`
  ADD PRIMARY KEY (`roundID`);

--
-- AUTO_INCREMENT för tabell `course`
--
ALTER TABLE `course`
  MODIFY `course_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT för tabell `player`
--
ALTER TABLE `player`
  MODIFY `player_id` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT för tabell `round`
--
ALTER TABLE `round`
  MODIFY `roundID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;
