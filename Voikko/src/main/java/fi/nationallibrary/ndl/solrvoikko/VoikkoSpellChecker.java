/*
 * Copyright 2012 The National Library of Finland
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *********************************************************************************/


package fi.nationallibrary.ndl.solrvoikko;

import java.io.IOException;
import java.util.Collection;

import org.apache.lucene.analysis.Token;
import org.apache.lucene.index.IndexReader;
import org.apache.solr.core.SolrCore;
import org.apache.solr.search.SolrIndexSearcher;
import org.apache.solr.spelling.SolrSpellChecker;
import org.apache.solr.spelling.SpellingResult;
import org.apache.solr.spelling.SpellingOptions;

/**
 *
 * @author ere.maijala@helsinki.fi
 * @author vaeinoe@gmail.com
 */
public class VoikkoSpellChecker extends SolrSpellChecker {

	@Override
	public void build(SolrCore arg0, SolrIndexSearcher arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public SpellingResult getSuggestions(SpellingOptions options)
			throws IOException {
		SpellingResult result = new SpellingResult();
		// TODO
		return result;
	}

	@Override
	public void reload(SolrCore arg0, SolrIndexSearcher arg1)
			throws IOException {
		// TODO Auto-generated method stub

	}

}
