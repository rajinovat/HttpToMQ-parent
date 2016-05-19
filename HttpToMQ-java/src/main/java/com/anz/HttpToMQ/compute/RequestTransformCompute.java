/**
 * 
 */
package com.anz.HttpToMQ.compute;

import com.anz.HttpToMQ.transform.PreTransformBLSample;
import com.anz.common.compute.impl.CommonBlobTransformCompute;
import com.anz.common.transform.ITransformer;

/**
 * @author sanketsw
 *
 */
public class RequestTransformCompute extends CommonBlobTransformCompute {

	/* (non-Javadoc)
	 * @see com.anz.common.compute.impl.CommonJsonJsonTransformCompute#getTransformer()
	 */
	@Override
	public ITransformer<String, String> getTransformer() {
		return new PreTransformBLSample();
	}


}
